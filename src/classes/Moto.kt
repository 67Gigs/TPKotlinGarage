package classes

class Moto(marque: String, couleur: String, annee: Int, private var sideCar: Boolean) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Side-car: $sideCar")
    }

    override fun klaxonner() {
        println("Bip bip!")
    }
}