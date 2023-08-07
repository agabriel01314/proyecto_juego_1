import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa extends World
{
    public vidas obvidas;
    /**
     * Constructor for objects of class mapa.
     * 
     */

    public mapa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        Player n1= new Player();
        addObject(n1,20,320);
        obvidas=new vidas();
    }
    

    private void prepare()
    {

        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,26,337);
        plat plat = new plat();
        addObject(plat,131,350);
        plat plat2 = new plat();
        addObject(plat2,215,315);
        plat plat3 = new plat();
        addObject(plat3,328,313);
        plat2.setLocation(231,325);
        plat3.setLocation(324,350);
        plat plat4 = new plat();
        addObject(plat4,419,326);
        plat plat5 = new plat();
        addObject(plat5,506,283);
        plat plat6 = new plat();
        addObject(plat6,418,230);
        plat6.setLocation(415,244);
        plat plat7 = new plat();
        addObject(plat7,320,210);
        plat plat8 = new plat();
        addObject(plat8,217,173);
        plat plat9 = new plat();
        addObject(plat9,134,207);
        plat plat10 = new plat();
        addObject(plat10,40,171);
        plat plat11 = new plat();
        addObject(plat11,125,109);
        plat10.setLocation(70,167);
        plat8.setLocation(205,181);
        plat plat12 = new plat();
        addObject(plat12,221,95);
        plat8.setLocation(245,179);
        plat7.setLocation(317,213);
        plat6.setLocation(414,244);
        plat5.setLocation(513,289);
        plat4.setLocation(438,330);
        plat3.setLocation(344,352);
        plat12.setLocation(232,99);
        plat plat13 = new plat();
        addObject(plat13,333,86);
        plat plat14 = new plat();
        addObject(plat14,434,133);
        Plataforma_final plataforma_final = new Plataforma_final();
        addObject(plataforma_final,566,64);
        plat plat15 = new plat();
        addObject(plat15,526,160);
        plat plat16 = new plat();
        addObject(plat16,579,104);
        plataforma_final.setLocation(515,56);
        checkpoint.setLocation(18,339);
        Player player = new Player();
        addObject(player,23,322);
        player.setLocation(27,325);
        removeObject(player);
        plat12.setLocation(222,96);

        s s = new s();
        addObject(s,299,391);
        s.setLocation(300,391);
        s.setLocation(523,393);
        removeObject(s);
        s s2 = new s();
        addObject(s2,300,390);
        s2.setLocation(146,387);
        removeObject(s2);
        s s3 = new s();
        addObject(s3,299,391);
        s3.setLocation(245,385);
        s3.setLocation(169,389);
        s3.setLocation(300, 390);
        s3.setLocation(178,391);
        s3.setLocation(300, 392);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void StarGame()
    {

        plat plat = new plat();
        addObject(plat,30,354);
        plat plat2 = new plat();
        addObject(plat2,127,385);
        plat plat3 = new plat();
        addObject(plat3,228,351);
        plat plat4 = new plat();
        addObject(plat4,340,349);
        plat plat5 = new plat();
        addObject(plat5,451,319);
        plat plat6 = new plat();
        addObject(plat6,530,265);
        plat6.setLocation(538,284);
        plat plat7 = new plat();
        addObject(plat7,449,225);
        plat6.setLocation(539,280);
        plat plat8 = new plat();
        addObject(plat8,339,261);
        plat8.setLocation(338,248);
        plat plat9 = new plat();
        addObject(plat9,237,221);
        plat plat10 = new plat();
        addObject(plat10,140,197);
        plat10.setLocation(133,192);
        plat plat11 = new plat();
        addObject(plat11,41,149);
        plat plat12 = new plat();
        addObject(plat12,132,102);
        plat.setLocation(239,103);
        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,31,360);
        plat plat13 = new plat();
        addObject(plat13,354,99);
        plat8.setLocation(334,253);
        plat.setLocation(236,105);
        plat plat14 = new plat();
        addObject(plat14,454,54);
        Plataforma_final plataforma_final = new Plataforma_final();
        addObject(plataforma_final,574,51);
        Player player = new Player();
        addObject(player,33,337);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void startGame()
    {

        platafroma_grande platafroma_grande = new platafroma_grande();
        addObject(platafroma_grande,50,360);
        platafroma_grande.setLocation(35, 360);
        platafroma_grande.setLocation(35, 350);
        platafroma_grande.setLocation(7,346);
        platafroma_grande.setLocation(35, 360);
        platafroma_grande platafroma_grande2 = new platafroma_grande();
        addObject(platafroma_grande2,284,269);
        platafroma_grande2.setLocation(329,269);
        removeObject(platafroma_grande2);
        platafroma_grande platafroma_grande3 = new platafroma_grande();
        addObject(platafroma_grande3,224,352);
        platafroma_grande platafroma_grande4 = new platafroma_grande();
        addObject(platafroma_grande4,426,348);
        platafroma_grande3.setLocation(209,377);
        platafroma_grande3.setLocation(172,383);
        platafroma_grande4.setLocation(372,376);
        platafroma_grande3.setLocation(144,381);
        removeObject(platafroma_grande);
        removeObject(platafroma_grande3);
        removeObject(platafroma_grande4);

        plat plat = new plat();
        addObject(plat,28,356);
        plat plat2 = new plat();
        addObject(plat2,106,354);
        plat plat3 = new plat();
        addObject(plat3,169,379);
        plat plat4 = new plat();
        addObject(plat4,233,392);
        plat plat5 = new plat();
        addObject(plat5,294,359);
        plat plat6 = new plat();
        addObject(plat6,355,314);
        plat plat7 = new plat();
        addObject(plat7,424,277);
        plat2.setLocation(126,353);
        plat3.setLocation(232,380);
        plat4.setLocation(538,232);
        plat5.setLocation(347,355);
        plat3.setLocation(247,377);
        plat5.setLocation(342,344);
        plat6.setLocation(432,313);
        plat6.setLocation(420,303);
        plat7.setLocation(344,263);
        plat4.setLocation(257,234);
        plat plat8 = new plat();
        addObject(plat8,148,245);
        plat plat9 = new plat();
        addObject(plat9,49,201);
        plat plat10 = new plat();
        addObject(plat10,145,154);
        plat plat11 = new plat();
        addObject(plat11,231,116);
        plat plat12 = new plat();
        addObject(plat12,352,110);
        plat7.setLocation(363,260);
        plat4.setLocation(269,224);
        plat6.setLocation(446,301);
        plat plat13 = new plat();
        addObject(plat13,452,153);
        plat plat14 = new plat();
        addObject(plat14,567,110);
        plat9.setLocation(63,203);
        removeObject(plat9);
        plat14.setLocation(557,113);
        removeObject(plat14);
        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,32,201);
        Plataforma_final plataforma_final = new Plataforma_final();
        addObject(plataforma_final,568,100);
        Player player = new Player();
        addObject(player,26,331);
        checkpoint.setLocation(44,197);
        checkpoint.setLocation(53,195);
        checkpoint.setLocation(51,199);
        plataforma_final.setLocation(554,109);
        removeObject(player);
        addObject(player,23,337);
    }
}
