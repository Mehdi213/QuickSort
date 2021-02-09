import java.util.Arrays;

public class Quick {
    Quick(){

    }
    int pivot;
    public void Quicksort (int [] tab , int d , int f ){
        if (d<f){
            int q= partionner(tab ,d ,f);
            Quicksort(tab ,d ,q);
            Quicksort(tab,q+1,f);

        }


    }

    public  int  partionner (int[ ] tab, int d , int f){
       int j= f+1;
       int i= d-1;
       pivot=tab[d];
  while (true) {
      do {
          j--;
      }
      while (tab[j] > pivot);

      do {
          i++;
      }
      while (tab[i] <pivot);


      if (i < j) {
          permute(tab, i, j);

      }else

         break;
  }
      return j;
    }
    public  void  permute (int [] tab, int i,int j){
        int temp;
        temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;

    }

    public static void main(String[] args) {
        Quick p =new Quick();
        int [] tab = {6,1,0,5,2,56,8,3,70};
        p.Quicksort(tab,0, 8);
        for (int i=0;i<tab.length  ;i++){
            System.out.print(tab[i]+"   ");
        }

    }
}
