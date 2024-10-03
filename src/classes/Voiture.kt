package classes

class Voiture(marque: String, couleur: String, annee: Int, private var nbPorte: Int, private var cylindree: Int) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Nombre de portes: $nbPorte, Cylindrée: $cylindree")
    }

    override fun klaxonner() {
        println("Pouet pouet!")
    }

    fun getNbPorte(): Int {
        return nbPorte
    }

    fun getCylindree(): Int {
        return cylindree
    }

    fun setNbPorte(nbPorte: Int) {
        this.nbPorte = nbPorte
    }

    fun setCylindree(cylindree: Int) {
        this.cylindree = cylindree
    }

}