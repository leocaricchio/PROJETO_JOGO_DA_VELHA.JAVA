import java.util.Scanner;
public class Primeiraquestao{
    public static void main(String[] args){
        int[]contador=new int[10];
        for(int i=0;i<10;i++){
            contador[i]=0;
        }
        Scanner entrada=new Scanner(System.in);
        System.out.println("digite um token: ");
        String token=entrada.nextLine();
        do{
			if(token.trim().isEmpty()){
				break;
			}
        String[]caracteresString=new String[token.length()];
        for(int i=0;i<token.length();i++){
             caracteresString[i]="" + token.charAt(i);
         }
        for(int i=0;i<token.length();i++){
            if(caracteresString[i].equals("0")){
                contador[0]+=1;
            }
            else if(caracteresString[i].equals("1")){
                contador[1]+=1;
            }
            else if(caracteresString[i].equals("2")){
                contador[2]+=1;
            }
            else if(caracteresString[i].equals("3")){
                contador[3]+=1;
            }
            else if(caracteresString[i].equals("4")){
                contador[4]+=1;
            }
            else if(caracteresString[i].equals("5")){
                contador[5]+=1;
            }
            else if(caracteresString[i].equals("6")){
                contador[6]+=1;
            }
            else if(caracteresString[i].equals("7")){
                contador[7]+=1;
            }
            else if(caracteresString[i].equals("8")){
                contador[8]+=1;
            }
            else if(caracteresString[i].equals("9")){
                contador[9]+=1;
            }
        }
        token=entrada.nextLine();
	}while(true);
        for(int i=0;i<10;i++){
            System.out.printf("%d:%d\n",i,contador[i]);
        }
     }
}
