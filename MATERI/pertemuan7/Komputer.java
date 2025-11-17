
package pertemuan7;


public class Komputer {
    private String vendor, type;
    private Monitor monitor;
    private Processor processor;
    private Mouse mouse;
    
    public Komputer (String vendor, String type){
        this.vendor = vendor;
        this.type = type;
    }
    
    public void addKomponen(Monitor m, Processor p, Mouse mos){
        this.monitor = m;
        this.mouse = mos;
        this.processor = p;
    }
    
    public void tampilSpesifikasi(){
        System.out.println("Komputer : " + this.vendor);
        System.out.println("Tipe     : " +this.type);
        System.out.println("Spesifikasi dari komputer");
        System.out.println("1. Monitor   : "+this.monitor.getMerk());
        System.out.println("2. Mouse     : "+this.mouse.getMerk());
        System.out.println("3. Processor : "+this.processor.getTipe());
    }
}
