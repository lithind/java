// Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
// and static nested class RAM (memory, manufacturer). Create an object of CPU and print
// information of Processor and RAM.
class CPU
{
    int price=1000;
    class Processor
    {
        int nof_cores=4;
        String manufacturer="HP";
        void p_details()
        {
            System.out.println("Processor details:");
            System.out.println("_______________________");
            System.out.println("Number of cores : "+nof_cores+"\n"+"Manufacturer : "+manufacturer+"price :"+price);
        }
        

    }
    static class RAM
    {
        int memory=2;
        String manufacturer="Dell";
        void ram_details()
        {
            System.out.println("RAM details:");
            System.out.println("_______________________");
            System.out.println("Memory : "+memory+"\n"+"Manufacturer : "+manufacturer);
        }
    }
}
class innerclass
{
    public static void main(String args[]){
        CPU cpu_obj=new CPU();
        CPU.Processor pro_obj=cpu_obj.new Processor();
        pro_obj.p_details();
        CPU.RAM ram_obj=new CPU.RAM();
        ram_obj.ram_details();
    }
}