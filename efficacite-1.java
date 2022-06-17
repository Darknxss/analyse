package effaceEspace;

public class EffaceEspaceCompliquePourRien {
	public static void erase(String txt) {
		String ch = txt;
		String chNew = ch.replace("  ", "Ŋ");
		chNew = chNew.replace(" ", "");
		chNew = chNew.replace("Ŋ", "  ");
		System.out.println(chNew);			
	}
}
