import java.util.*;

public class Largest {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        /*for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[j]>a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                }
            }
            String arr=Arrays.toString(a);
            System.out.println(arr);
            System.out.println(a[n-1]);*/
            int max=a[0],sm=a[0];
            for(int i=0;i<n;i++){
               if(a[i]>max){
                sm=max;
                max=a[i];
               }
               else if(a[i]>sm && a[i]!=max){
                sm=a[i];
               }
            }
            System.out.println(max);
            System.out.print(sm);
            
        }

    }

