package com.example.presentation;

import com.example.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) {
        // Chargement du contexte Spring à partir du fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Récupération du bean metier
        Imetier metier = (Imetier) context.getBean("metier");

        // Exécution et affichage du résultat
        System.out.println("Résultat (XML) = " + metier.calcul());
    }
}
