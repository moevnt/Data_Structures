public class test {

    public static void main(String[] args){

                long start = System.nanoTime(); //fragment 1
                int sum=0;
                double n = Math.pow(10,4);
                for( int i = 0; i < n; i++ )
                    sum++;
                long total = System.nanoTime()-start;
                System.out.println(total);



            }

        }

