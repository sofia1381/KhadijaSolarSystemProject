package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem XFact=new SolarSystem();
        XFact.Sun="1";
        XFact.Moon="4";
        XFact.Planet="2";
        XFact.Stars="10000";

        //        adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";



        //add features for planet2
        Planet2 Olso = new Planet2();
        Olso.name="Ozhan";
        Olso.size="694254km";
        Olso.color="pink";

        //        adding features for planet1
        Planet1Feature GulK= new Planet1Feature();
        GulK.color="blue";
        GulK.size="3848325828km";
        GulK.name="preacheX";
    }
}
