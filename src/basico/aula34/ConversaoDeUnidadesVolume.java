package basico.aula34;

public class ConversaoDeUnidadesVolume {

    public static double litrosParaCentimetrosCubicos(double litro){
        return litro * 1000;
    }

    public static double metrosCubicosParaLitros(double metro){
        return metro * 1000;
    }

    public static double metrosCubicosParaPesCubicos(double metro){
        return metro * 35.32;
    }

    public static double galaoAmericanoParaPolegadasCubicas(double galao){
        return galao * 231;
    }

    public static double galaoAmericanoParaLitros(double galao){
        return galao * 3.785;
    }
}
