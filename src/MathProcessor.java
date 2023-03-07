public class MathProcessor extends Procesor{
    @Override
    public void process(int i, int e){
        System.out.println("Sum od integera je" + (i+e));
    }
    @Override
    public void process(int[] ints){
        int sum=0;
        for (int i:ints){
            sum+=i;
        }
        System.out.println("Sum je " + sum);
    }
}
