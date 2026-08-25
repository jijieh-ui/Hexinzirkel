
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hexinzirkel;

/**
 *
 * @author CompLabC209-PC29
 */
public class Hexinzirkel {

    public static void main(String[] args) {
        displayGreetings();
        divider();
        displayInfo();
    }
    
    public static void displayGreetings() {
        System.out.println("Welcome to Baldur’s Gate");
    }
    
    public static void displayInfo() {
        displayCharacter();
        displayClass();
    }
    
    public static void displayCharacter() {
        System.out.println("name: rheindotr");
        System.out.println("backstory: banished by the church for getting caught using forbidden magic, tampered with reality, and now lives as a husk of what he used to be");
        divider();
        System.out.println("race: Dark elf");
        System.out.println("race desc: used to be a holy elf, but corrupted by the dark fores");
    }
    
    public static void displayClass() {
        System.out.println("class: mage");
        System.out.println("class desc: a spell caster, that can warp reality");
        divider();
        System.out.println("utrait: undying will");
        System.out.println("utrait desc: if im still breathing, im still fighting, the more im hurt, proves that im stronger");
        divider2();
        displaySkill();
    }
    
    public static void displaySkill() {
        atomicRestraint();
        waveSubsonic();
        theHandOfGod();
        realityMirror();
    }
    
    public static void atomicRestraint() {
        System.out.println("skill: Atomic restraint");
        System.out.println("skill desc: manipulates the ground to the molecular level to change it's shape in order to restrain the opponent");
        divider2();
    }
    public static void waveSubsonic() {
        System.out.println("skill: Wave subsonic");
        System.out.println("skill desc: vibrates the air to subsonic level to is orientate the opponent");
        divider2();
    }
    public static void theHandOfGod() {
        System.out.println("skill: Atomic The Hand of God");
        System.out.println("skill desc: uses air pressure to slam down on the oponent");
        divider2();
    }
    public static void realityMirror() {
        System.out.println("skill: Reality mirror");
        System.out.println("skill desc: jumps to a dimension beyond time to view multiple reality of outcomes.");
        divider2();
    }
    
    public static void divider() {
        System.out.println("___________________________________________________________________________________________________");
    }
    public static void divider2() {
        System.out.println("-------------------------");
    }
}
