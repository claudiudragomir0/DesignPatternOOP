package creational.Builder.a;

import java.util.ArrayList;
import java.util.List;

public class BuilderPattern {
    public static void main(String[] args) {
        Computer myComputer = new Computer.ComputerBuilder("500 GB")
                .setRam("2 GB")
                .setUsbEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        Computer computer = new Computer.ComputerBuilder("250 GB")
                .setRam("8 GB")
                .setGraphicsCardEnabled(true)
                .build();

        //System.out.println(myComputer.isGraphicsCardEnabled());
        //System.out.println(myComputer.getRam());

        List<Computer> computerList = new ArrayList<>();
        computerList.add(myComputer);
        computerList.add(computer);

        System.out.println(computerList.get(1).isGraphicsCardEnabled());
        System.out.println(computerList.get(1).getHdd());
    }
}

class Computer {
    private String hdd;
    private String ram;
    private boolean isGraphicsCardEnabled;
    private boolean isUsbEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isUsbEnabled = builder.isUsbEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isUsbEnabled() {
        return isUsbEnabled;
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean isGraphicsCardEnabled;
        private boolean isUsbEnabled;

        public ComputerBuilder(String hdd) {
            this.hdd = hdd;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setUsbEnabled(boolean isUsbEnabled) {
            this.isUsbEnabled = isUsbEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}