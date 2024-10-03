package classes

class Camion : Vehicule {

    var capaciteChargement: Double = 0.0

    constructor(marque: String, couleur: String, annee: Int, capaciteChargement: Double) : super(marque, couleur, annee) {
        this.capaciteChargement = capaciteChargement
    }

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Capacité de chargement: $capaciteChargement")
    }

    override fun klaxonner() {
        println("Tuuut tuuut!")
    }
}