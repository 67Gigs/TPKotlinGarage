package classes

class Voiture(marque: String, couleur: String, annee: Int, private var nbPorte: Int) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Nombre de portes: $nbPorte")
    }

    override fun klaxonner() {
        println("Pouet pouet!")
    }

}