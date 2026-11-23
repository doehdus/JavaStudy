public class Project2 {
    public static void main(String[] args) {
        System.out.println("=== CPU 가상 프로그램 가동 ===");

        CPU myCpu = new CPU();

        System.out.println(new CPUComponent("Control Unit"));
        System.out.println(new CPUComponent("ALU"));
        System.out.println(new Register("R1"));
        System.out.println(new Register("R2"));

        String[] program = {
                "MOV  R1 25",
                "MOV  R2 10",
                "ADD  R1 R2",
                "SUB  R1 R2"
        };

        myCpu.runProgram(program);
        System.out.println("=== 프로그램 가동 종료 ===");
    }
}

class CPUComponent {
    public String name;

    public CPUComponent() {
        name = "";
    }

    public CPUComponent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "] 가동 준비 완료.";
    }
}

class Register extends CPUComponent {
    private int value;

    public Register(String name) {
        this.name = name;
        value = 0;
    }

    public void write(int data) {
        value = data;
    }

    public int read() {
        return value;
    }

    @Override
    public String toString() {
        return name + "=" + value;
    }
}

// ALU 클래스
class ALU extends CPUComponent {
    public ALU() {
        name = "ALU";
    }

    public int execute(String op, int val1, int val2) {
        if (op.equals("ADD")) {
            System.out.println("[ALU] 연산 수행: " + val1 + " + " + val2);
            return val1 + val2;
        } else if (op.equals("SUB")) {
            System.out.println("[ALU] 연산 수행: " + val1 + " - " + val2);
            return val1 - val2;
        }

        return 0;
    }
}

// ControlUnit 클래스
class ControlUnit extends CPUComponent {
    public ControlUnit() {
        name = "Control Unit";
    }

    public String[] fetch_and_decode(String instruction) {
        String[] words = instruction.split(" ");
        String[] result = new String[3];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("") == false) {
                result[count] = words[i];
                count++;
            }
        }

        System.out.println("[Control Unit] 명령어 해독: "
                + result[0] + " " + result[1] + " " + result[2]);

        return result;
    }
}

// CPU 클래스
class CPU {
    private ControlUnit cu;
    private ALU alu;
    private Register r1;
    private Register r2;

    public CPU() {
        cu = new ControlUnit();
        alu = new ALU();
        r1 = new Register("R1");
        r2 = new Register("R2");
    }

    private Register getRegister(String regName) {
        if (regName.equals("R1")) {
            return r1;
        } else if (regName.equals("R2")) {
            return r2;
        }

        return null;
    }

    public void runProgram(String[] program) {
        System.out.println("-------------------------------");

        for (int i = 0; i < program.length; i++) {
            String[] parts = cu.fetch_and_decode(program[i]);
            Register first = getRegister(parts[1]);

            if (first != null) {
                if (parts[0].equals("MOV")) {
                    int number = Integer.parseInt(parts[2]);
                    first.write(number);
                } else if (parts[0].equals("ADD")) {
                    Register second = getRegister(parts[2]);

                    if (second != null) {
                        int answer = alu.execute("ADD", first.read(), second.read());
                        first.write(answer);
                    }
                } else if (parts[0].equals("SUB")) {
                    Register second = getRegister(parts[2]);

                    if (second != null) {
                        int answer = alu.execute("SUB", first.read(), second.read());
                        first.write(answer);
                    }
                }
            }

            System.out.println("[현재 레지스터 상태] " + r1 + " | " + r2);
            System.out.println("-------------------------------");
        }
    }
}
