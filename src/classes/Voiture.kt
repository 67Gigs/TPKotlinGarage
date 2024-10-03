package classes

class Voiture(marque: String, couleur: String, annee: Int, private var nbPorte: Int, var cylindree: Int) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Nombre de portes: $nbPorte, Cylindrée: $cylindree")
    }

    override fun klaxonner() {
        println("Pouet pouet!")
    }

}