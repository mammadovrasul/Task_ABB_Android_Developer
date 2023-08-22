package az.abb.warehause

/**
 * Created by rasulmammadov on 23,August,2023
 */
object Warehause {

    /**
     * An object is a singleton in Kotlin, which means there will
     * be only one instance of the
     * Warehaus class throughout the application's lifecycle
     * */


    private val figures = mutableListOf<Figure>()

    fun addFigure(figure: Figure) {
        // this function helps us to add a figure to my encapsulated mutable list
        figures.add(figure)
    }

    fun figuresList(): List<Figure> {
        // this function will return immutable list
        return figures
    }

    fun getTotalAreaOfSurfaces(): Double {
        // this function will return all figures' total areas
        return figures.sumOf {
            it.calculateTotalArea()
        }
    }

    fun totalCountOfFigures(): Int {
        return figures.size
    }


}

