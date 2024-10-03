package classes

data class Garage(var vehicules: ArrayList<Vehicule>) {

    public fun ajouterVehicule(vehicule: Vehicule) {
        vehicules += vehicule
    }

    public fun afficherGarage() {
        for (vehicule in vehicules) {
            vehicule.afficherDetails()
        }
    }

    public fun afficherCamions() {
        for (vehicule in vehicules) {
            if (vehicule is Camion) {
                vehicule.afficherDetails()
            }
        }
    }

    public fun affichageMotos() {
        for (vehicule in vehicules) {
            if (vehicule is Moto) {
                vehicule.afficherDetails()
            }
        }
    }

    public fun afficherVoitures() {
        for (vehicule in vehicules) {
            if (vehicule is Voiture) {
                vehicule.afficherDetails()
            }
        }
    }

    public fun affichageChoix(choix: String) {
        when (choix.uppercase()) {
            "Voiture".uppercase() -> afficherVoitures()
            "Moto".uppercase() -> affichageMotos()
            "Camion".uppercase() -> afficherCamions()
            else -> afficherGarage()
        }
    }

    public fun affichageOrdre(choix: String) {
        when (choix.uppercase()) {
            "Marque".uppercase() -> vehicules.sortBy { it.marque }
            "Annee".uppercase() -> vehicules.sortBy { it.annee }
            else -> vehicules.sortBy { it.marque }
        }
    }

    public fun klaxonner() {
        for (vehicule in vehicules) {
            vehicule.klaxonner()
        }
    }
}