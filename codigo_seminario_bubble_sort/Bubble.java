public class Bubble {
    public static void bubble(int[] bolha){

        int i = bolha.length - 1;

        while (i > 0){
            int changes = 0;
            int j = 0;
            while (j < i){
                if (bolha[j] > bolha[j + 1]){

                    int temp = bolha[j];
                    bolha[j] = bolha[j + 1];
                    bolha[j + 1] = temp;
                    changes ++;

                }
                j++;
            }
            if (changes == 0) break;
            i--;
        }
    }
}
