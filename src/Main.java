public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(100, 10, "N/A", 10);
        Ram ram = new Ram(RamType.DRAM, 10, 10);
        Hdd hdd = new Hdd(HddType.SSD, 10, 10);
        Screen screen = new Screen(10, ScreenType.VA, 10);
        Keyboard keyboard = new Keyboard(KeyboardType.MAGNETIC, KeyboardIlluminate.YES, 10);

        Computer computer1 = new Computer("USA", "SkynetCo", processor, ram, hdd, screen, keyboard);
        computer1 = computer1.setProcessor(processor.setFrequency(300).setCores(12).setMade("USA").setWeight(450));
        computer1 = computer1.setRam(ram.setRamType(RamType.SRAM).setVolume(10).setWeight(310));
        computer1 = computer1.setHdd(hdd.setHddType(HddType.HDD).setVolume(512).setWeight(310));
        computer1 = computer1.setScreen(screen.setDiagonal(64).setScreenType(ScreenType.IPS).setWeight(2700));
        computer1 = computer1.setKeyboard(keyboard.setKeyboardType
                (KeyboardType.MECHANICAL).setKeyboardIlluminate(KeyboardIlluminate.YES).setWeight(295));

        Computer computer2 = new Computer("Russia", "Рогозин и Ко", processor, ram, hdd, screen, keyboard);
        computer2 = computer2.setProcessor(processor.setFrequency(416).setCores(16).setMade("Russia").setWeight(375));
        computer2 = computer2.setRam(ram.setRamType(RamType.SRAM).setVolume(12).setWeight(410));
        computer2 = computer2.setHdd(hdd.setHddType(HddType.SSD).setVolume(1024).setWeight(475));
        computer2 = computer2.setScreen(screen.setDiagonal(72).setScreenType(ScreenType.TN).setWeight(3100));
        computer2 = computer2.setKeyboard(keyboard.setKeyboardType
                (KeyboardType.OPTICAL).setKeyboardIlluminate(KeyboardIlluminate.YES).setWeight(300));

        Computer computer3 = new Computer("Japan", "KurillHasNot", processor, ram, hdd, screen, keyboard);
        computer3 = computer3.setProcessor(processor.setFrequency(388).setCores(4).setMade("North Korea").setWeight(1500));
        computer3 = computer3.setRam(ram.setRamType(RamType.DRAM).setVolume(4).setWeight(800));
        computer3 = computer3.setHdd(hdd.setHddType(HddType.HDD).setVolume(666).setWeight(1700));
        computer3 = computer3.setScreen(screen.setDiagonal(12).setScreenType(ScreenType.IPS).setWeight(5000));
        computer3 = computer3.setKeyboard(keyboard.setKeyboardType
                (KeyboardType.RUBBER).setKeyboardIlluminate(KeyboardIlluminate.NO).setWeight(568));

        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);
        System.out.println();
        System.out.println(computer3);


    }
}
