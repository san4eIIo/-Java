
//операція о1 = +; операція о2 = -; тип данних float;
class Main {
    public static void main(String[] args) {
        float a = 3;
        float b = 5;
        float c = 0;
        float m = 7;
        float n = 4;
        float result = 0;
        if (a == c && a<=c){
            System.out.println("Error can`t be divided by 0");
            }
        if (a >n){
            System.out.println("Error input smaller a");
        }
        if (b >m){
            System.out.println("Error input smaller b");
        }
        for (float i=a; i<=n; i++){
            for (float j=b; j<=m; j++){
                result += (i+j)/(i-c);
            }
        }
        System.out.println(result);

    }


}