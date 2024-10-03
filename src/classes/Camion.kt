package classes

class Camion(marque: String, couleur: String, annee: Int, private var capaciteChargement: Double) :
    Vehicule(marque, couleur, annee) {

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Capacité de chargement: $capaciteChargement")
    }

    override fun klaxonner() {
        println("Tuuut tuuut!")
    }

    fun getCapaciteChargement(): Double {
        return capaciteChargement
    }

    fun setCapaciteChargement(capaciteChargement: Double) {
        this.capaciteChargement = capaciteChargement
    }
}