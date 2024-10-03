package classes

class Voiture : Vehicule {

    var nbPorte: Int = 0

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Nombre de portes: $nbPorte")
    }

    constructor(marque: String, couleur: String, annee: Int, nbPorte: Int) : super(marque, couleur, annee) {
        this.nbPorte = nbPorte
    }

    override fun klaxonner() {
        println("Pouet pouet!")
    }

}