package classes

// Moto class that inherits from Vehicule class
class Moto(marque: String, couleur: String, annee: Int, private var sideCar: Boolean) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Side-car: $sideCar")
    }

    override fun klaxonner() {
        println("Bip bip!")
    }

    // Getters and setters
    fun getSideCar(): Boolean {
        return sideCar
    }

    fun setSideCar(sideCar: Boolean) {
        this.sideCar = sideCar
    }
}