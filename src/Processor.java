public class Processor {
    private final int frequency; // частота
    private final int cores; // количество ядер
    private final String made; // производитель
    private final int weight; // вес

    public Processor(int frequency,int cores, String made, int weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.made = made;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getMade() {
        return made;
    }

    public Processor setFrequency(int frequency) {
        return new Processor(frequency, cores, made,weight);
    }

    public Processor setCores(int cores) {
        return new Processor(frequency, cores, made,weight);
    }

    public Processor setMade(String made) {
        return new Processor(frequency, cores, made,weight);
    }

    public Processor setWeight(int weight) {
        return new Processor(frequency, cores, made,weight);
    }

    public int getWeight() {
        return weight;
    }
}
