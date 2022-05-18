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

        //        adding the features for star in the solar system
        FeatureStars FacX = new FeatureStars();
        FacX.color="green";
        FacX.radius="738y4932749km";
        FacX.size="9999999999m";
    }
}
