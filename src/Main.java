public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Graphe g=new Graphe(40);
        g.addArc(0,1);
		g.addArc(1,3);
		g.addArc(1,5);
		g.addArc(1,6);
		g.addArc(1,7);
		g.addArc(2,1);
		g.addArc(3,2);
		g.addArc(3,6);
		g.addArc(4,2);
		g.addArc(4,9);
		g.addArc(7,3);
		g.addArc(7,6);
		g.addArc(8,2);
		g.addArc(8,4);
		g.addArc(8,5);
		g.addArc(9,1);
        g.addArc(8,1);
        g.addArc(8,3);
        g.addArc(8,6);
        g.addArc(9,0);

		g.addArc(10,1);
		g.addArc(11,13);
		g.addArc(15,25);
		g.addArc(21,6);
		g.addArc(11,7);
		g.addArc(12,1);
		g.addArc(13,12);
		g.addArc(23,16);
		g.addArc(24,22);
		g.addArc(14,29);
		g.addArc(17,23);
		g.addArc(27,26);
		g.addArc(18,2);
		g.addArc(18,4);
		g.addArc(18,15);
		g.addArc(29,1);
		g.addArc(28,1);
		g.addArc(18,13);
		g.addArc(7,16);
		g.addArc(19,0);
		g.addArc(20,11);

		g.addArc(5,13);
		g.addArc(6,25);
		g.addArc(2,19);
		g.addArc(11,17);
		g.addArc(10,14);
		g.addArc(13,19);
		g.addArc(22,11);
		g.addArc(20,8);
		g.addArc(11,27);
		g.addArc(16,21);
		g.addArc(24,22);
		g.addArc(14,21);
		g.addArc(11,25);
		g.addArc(15,14);
		g.addArc(28,2);
		g.addArc(17,3);
		g.addArc(12,4);
		g.addArc(4,15);
		g.addArc(26,0);
		g.addArc(25,5);

		g.addArc(39,13);
		g.addArc(37,25);
		g.addArc(38,19);
		g.addArc(35,17);
		g.addArc(36,14);
		g.addArc(34,19);
		g.addArc(33,11);
		g.addArc(31,8);
		g.addArc(30,27);
		g.addArc(29,21);
		g.addArc(28,22);
		g.addArc(26,21);
		g.addArc(25,25);
		g.addArc(32,14);
		g.addArc(38,2);
		g.addArc(37,3);
		g.addArc(12,4);
		g.addArc(34,15);
		g.addArc(36,0);
		g.addArc(35,5);



		Graphe gr=new Graphe(6);
		gr.addArc(1,2);
		gr.addArc(6,2);
		gr.addArc(5,4);
		gr.addArc(2,3);
		gr.addArc(4,2);
		gr.addArc(5,2);
		gr.addArc(3,2);
		gr.addArc(2,5);
		gr.addArc(1,5);
		gr.addArc(4,2);
		gr.addArc(5,2);
		gr.addArc(3,2);
		gr.addArc(1,5);
		gr.addArc(0,5);



		//System.out.println(g.toString());
/*
	   System.out.println("\n *********************  Parcourt en profondeur Recursif *********************");
	   g.parcours();

	   System.out.println("\n *********************  Parcourt en profondeur Iteratif  *********************");
	   g.profI();

	   System.out.println("\n *********************  Parcourt en largeur *********************");
	   g.largeur();
*/      g.export();

		/*System.out.println(" ******************  Coloration Degre croissant     *****************          ");
		System.out.println("\nnombre chromatique: "+g.degreDecroissant());

		System.out.println(" ******************  Coloration indice croissant    *****************        ");
		System.out.println("\nnombre chromatique: "+g.indiceCroissant());*/

        Graphe g1=new Graphe("class Graphe.csv");
		System.out.println(g1.toString());
		System.out.println(" ******************  Coloration Degre croissant     *****************          ");
		long begin=System.nanoTime();
		System.out.println("\nnombre chromatique: "+g1.degreDecroissant());
		long end =System.nanoTime();
		float time=end-begin;
		System.out.println(time);
		System.out.println(" ******************  Coloration indice croissant    *****************        ");
			long begin1=System.nanoTime();
		System.out.println("\nnombre chromatique: "+g1.indiceCroissant());
		long end1 =System.nanoTime();

		float time1=end1-begin1;
		System.out.println(time1);
		long begin2=System.nanoTime();
		 System.out.println(g1.recuitSimule(1.5,0.5));
		long end2 =System.nanoTime();

		float time2=end2-begin2;
		System.out.println(time2);
		//IndiceCroissant i=new IndiceCroissant(g1);
		//DegreDecroissant d=new DegreDecroissant(g1);
		//System.out.println(g1.listNoeudDegreDeCroissant().toString());
		//System.out.println(g1.matriceAdj()[1][0]);*/



    }

}
