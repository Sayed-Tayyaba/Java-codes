public class Cellphone {
    private String IMEI_code;
    private String SIM_card;
    private String processor;
    private int Internal_memory;
    private boolean is_Dual_sim;

    Cellphone(String IMEI_code,String SIM_card,String processor,int Internal_memory,boolean is_Dual_sim){
        this.IMEI_code=IMEI_code;
        this.SIM_card=SIM_card;
        this.processor=processor;
        this.Internal_memory=Internal_memory;
        this.is_Dual_sim=is_Dual_sim;
    }

    public String getIMEI_code() {
        return IMEI_code;
    }

    public void setIMEI_code(String IMEI_code) {
        this.IMEI_code = IMEI_code;
    }

    public String getSIM_card() {
        return SIM_card;
    }

    public void setSIM_card(String SIM_card) {
        this.SIM_card = SIM_card;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getInternal_memory() {
        return Internal_memory;
    }

    public void setInternal_memory(int internal_memory) {
        Internal_memory = internal_memory;
    }

    public boolean isIs_Dual_sim() {
        return is_Dual_sim;
    }

    public void setIs_Dual_sim(boolean is_Dual_sim) {
        this.is_Dual_sim = is_Dual_sim;
    }

    public void dial_no(String no){
        System.out.println("Dialing:"+no);
    }
    public void recieve(){
        System.out.println("Recieving:");
    }
    public void sendSMS(String no,String message){
        System.out.println("Sending SMS to:"+no+" "+message);
    }
    public void recieve_a_SMS(String message){
        System.out.println("Recieve an meassage"+message);
    }
    public static void main(String[] args) {
        Cellphone c1=new Cellphone("IEDF34343435235","Nano sim","SnapDragon",8,true);
        System.out.println("IMEI"+c1.getIMEI_code());
        System.out.println("SIM card:"+c1.getSIM_card());
        System.out.println("Processor:"+c1.getProcessor());
        System.out.println("Internal memory:"+c1.getInternal_memory());
        System.out.println("Dual sim:"+c1.isIs_Dual_sim());

        c1.dial_no("03434602248");
        c1.recieve();
        c1.sendSMS("03433265180","Hello");
        c1.recieve_a_SMS("hi");

    }
}
