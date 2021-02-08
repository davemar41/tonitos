import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static  void main(String[]args){
        String[]domajarray={"DO","re","mi","FA","SOL","la","si"};
        String[]solmajarray={"SOL","la","si","DO","RE","mi","fa#"};
        String[]remajarray={"RE","mi","fa#","SOL","LA","si","do#"};
        String[]lamajarray={"LA","si","do#","RE","MI","fa#","sol#"};
        String[]mimajarray={"MI","fa#","sol#","LA","SI","do#","re#"};
        String[]simajarray={"SI","do#","re#","MI","FA#","sol#","la#"};
        String[]solbmajarray={"SOLb","lab","sib","DO","REb","mib","fab"};
        String[]rebmajarray={"REb","mib","fa","SOLb","LAb","sib","do"};
        String[]labmajarray={"LAb","sib","do","REb","Mib","fa","sol"};
        String[]mibmajarray={"MIb","fa","sol","LAb","SIb","do","re"};
        String[]sibmajarray={"SIb","do","re","MIb","FA","sol","la"};// ESTE PROBLEMA
        String[]famajarray={"FA","sol","la","SIb","DO","re","mi"};

        ArrayList<String>domaj=new ArrayList<String>();
        domaj.addAll(Arrays.asList(domajarray));
        ArrayList<String>solmaj=new ArrayList<String>();
        solmaj.addAll(Arrays.asList(solmajarray));
        ArrayList<String>remaj=new ArrayList<String>();
        remaj.addAll(Arrays.asList(remajarray));
        ArrayList<String>lamaj=new ArrayList<String>();
        lamaj.addAll(Arrays.asList(lamajarray));
        ArrayList<String>mimaj=new ArrayList<String>();
        mimaj.addAll(Arrays.asList(mimajarray));
        ArrayList<String>simaj=new ArrayList<String>();
        simaj.addAll(Arrays.asList(simajarray));
        ArrayList<String>solbmaj=new ArrayList<String>();
        solbmaj.addAll(Arrays.asList(solbmajarray));
        ArrayList<String>rebmaj=new ArrayList<String>();
        rebmaj.addAll(Arrays.asList(rebmajarray));
        ArrayList<String>labmaj=new ArrayList<String>();
        labmaj.addAll(Arrays.asList(labmajarray));
        ArrayList<String>mibmaj=new ArrayList<String>();
        mibmaj.addAll(Arrays.asList(mibmajarray));
        ArrayList<String>sibmaj=new ArrayList<String>();
        sibmaj.addAll(Arrays.asList(sibmajarray));
        ArrayList<String>famaj=new ArrayList<String>();
        famaj.addAll(Arrays.asList(famajarray));

        Scanner entrada=new Scanner(System.in);
        ArrayList<String>misnotas=new ArrayList<String>();
        System.out.println("Bienvenido a TONITOS, \n " +
                " el programa según sus notas de entrada selecciona el tono de la cancion, \n"  +
                " asi como unas alternativas para improvisar o generar melodias \n " +
                " RECUERDE QUE LOS ACORDES MAYORES DEBEN DE IR EN MAYUSCULAS Y LOS MENORES EN MINUSCULAS, \n " +
                " RECUERDE QUE NO DEBE DE INCLUIR LAS SEPTIMAS O NOVENAS NI NINGUNA TENSIÓN \n ");
        System.out.println("cuantas notas tiene su cancion");
        int numeronotas= entrada.nextInt();
        //String notas=entrada.next();
            for(int i = 0 ; i <numeronotas;i++){
                System.out.println("ingrese sus notas");
                misnotas.add(entrada.next());
            }




        System.out.println("desea calcular su tonalidad y sus posible escalas? Y, N");
        if(entrada.next().toString().equals("Y")){
            Calcular(misnotas,domaj,solmaj,remaj,lamaj);
            Calcular2(misnotas,mimaj,simaj,solbmaj,rebmaj);
            Calcular3(misnotas,mibmaj,labmaj,famaj,sibmaj);
        }




    }
    private static void Calcular(ArrayList<String>misnotas,ArrayList<String>domaj,ArrayList<String>solmaj,ArrayList<String>remaj,
                                 ArrayList<String>lamaj ){
       if(domaj.containsAll(misnotas)) {
           System.out.println("la cancion esta en Do mayor o en Lamenor, puede usar : \n" +
                   " pentatonica mayor de Do \n " +
                   " pentatonica menor de La \n " +
                   " grado jonico de Domayor \n " +
                   " grado eolico de lamenor");
           //System.out.println(misnotas.retainAll(domaj));
       }else if(solmaj.containsAll(misnotas)){
           System.out.println("la cancion esta en Sol mayor o en Mi menor, puede usar : \n" +
                   " pentatonica mayor de Sol,traste 15 o 3 \n " +
                   " pentatonica menor de Mi,traste doce o cero \n " +
                   " grado jonico de Solmayor \n " +
                   " grado eolico de Mi menor");
       }else if(remaj.containsAll(misnotas)){
           System.out.println("la cancion esta en Re mayor o en Si menor, puede usar :" +
                   " pentatonica mayor de Re,traste 10 \n " +
                   " pentatonica menor de Si,traste siete o 17 \n  " +
                   " grado jonico de Re mayor  \n" +
                   " grado eolico de Si menor");
       }else if(lamaj.containsAll(misnotas)){
           System.out.println("la cancion esta en la mayor o en fa# menor, puede usar :" +
                   " pentatonica mayor de la,traste 5  \n " +
                   " pentatonica menor de fa#,traste 2 o 14 \n " +
                   " grado jonico de la mayor \n" +
                   " grado eolico de fa# menor");
       }else{
           System.out.println("no se encuentra en este metodo de busqueda");
       }
    }private static  void Calcular2(ArrayList<String>misnotas,ArrayList<String>mimaj,ArrayList<String>simaj,
                                    ArrayList<String>solbmaj,ArrayList<String>rebmaj){
        if(mimaj.containsAll(misnotas)) {
            System.out.println("la cancion esta en Mi mayor o en Reb menor, puede usar : \n " +
                    " pentatonica mayor de Mi  traste 12 \n " +
                    " pentatonica menor de Reb  traste 9 \n " +
                    " grado jonico de Mimayor  traste 12\n " +
                    " grado eolico de Rebmenor traste 9\n ");
            //System.out.println(misnotas.retainAll(domaj));

        }else if(solbmaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Solb mayor o en Mib menor, puede usar : \n " +
                    " pentatonica mayor de Solb,traste 14  \n " +
                    " pentatonica menor de Mib,traste siete o 11 \n " +
                    " grado jonico de Solb mayor traste 14 \n" +
                    " grado eolico de Mib menor traste 11");
        }else if(rebmaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Reb mayor o en Do menor, puede usar : \n" +
                    " pentatonica mayor de Reb ,traste 11 \n " +
                    " pentatonica menor de Do,traste 8 o 20  \n " +
                    " grado jonico de Reb mayor  traste 11 \n " +
                    " grado eolico de Do menor  traste 8 o 20\n ");
        }else if(simaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Si mayor o en Sol# menor, puede usar : \n" +
                    " pentatonica mayor de Si ,traste 7 o 19 \n " +
                    " pentatonica menor de Sol#,traste 4 o 16  \n " +
                    " grado jonico de Reb mayor  traste 7 o 9 \n " +
                    " grado eolico de Do menor  traste 4 0 16 \n ");

        } else{
            System.out.println("no se encuentra en este metodo de busqueda");
        }



    }private static void Calcular3(ArrayList<String>misnotas,ArrayList<String>mibmaj,ArrayList<String>famaj,ArrayList<String>labmaj,ArrayList<String>sibmaj){
        if(mibmaj.containsAll(misnotas)) {
            System.out.println("la cancion esta en Mib mayor o en Do menor, puede usar : \n" +
                    " pentatonica mayor de Mib traste 11 \n " +
                    " pentatonica menor de DO traste 8 o 20 el que pueda XDDD!!!\n " +
                    " grado jonico de Mib mayor 11 \n " +
                    " grado eolico de Do menor 8 O 20");
            //System.out.println(misnotas.retainAll(domaj));
        }else if(famaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Fa mayor o en Re menor, puede usar : \n " +
                    " pentatonica mayor de Fa,traste 13  \n " +
                    " pentatonica menor de Re,traste 10  \n " +
                    " grado jonico de Famayor  TRASTE 13\n " +
                    " grado eolico de Re menor TRASTE 10");
        }else if(labmaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Lab mayor o en Fa menor, puede usar : \n " +
                    " pentatonica mayor de Lab,traste 4 o 16  \n " +
                    " pentatonica menor de Fa,traste 1 o 13  \n " +
                    " grado jonico de Lab mayor TRASTE 4 o 16\n " +
                    " grado eolico de Fa menor TRASTE 1 O 13");
        }else if(sibmaj.containsAll(misnotas)){
            System.out.println("la cancion esta en Sib mayor o en Sol menor, puede usar : \n" +
                    " pentatonica mayor de Sib ,traste 6 o 17 \n " +
                    " pentatonica menor de Sol,traste 3 o 15 \n " +
                    " grado jonico de Sib mayor TRASTE 6 O 17 \n" +
                    " grado eolico de Sol menor TRASTE 3 O 15");
        }else{
            System.out.println("no se encuentra en este metodo de busqueda");
        }

    }

}
