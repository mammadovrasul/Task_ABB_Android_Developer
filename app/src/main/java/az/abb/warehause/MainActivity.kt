package az.abb.warehause

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import az.abb.warehause.figures_model.Cone
import az.abb.warehause.figures_model.Cube
import az.abb.warehause.figures_model.Cuboid
import az.abb.warehause.figures_model.CylinderClosedAtTop
import az.abb.warehause.figures_model.CylinderOpenAtTop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Warehause.addFigure(Cone(3.0, 4.5, 3.0))

        /**
         * some code example to add figure
         * */
        Warehause.addFigure(Cube(3.0))
        Warehause.addFigure(Cuboid(3.0, 4.5, 3.0))
        Warehause.addFigure(CylinderClosedAtTop(3.0, 4.5))
        Warehause.addFigure(CylinderOpenAtTop(3.0, 4.5))
//        Warehause.addFigure(Frustum(3.0, 4.5, 3.0, 1.0))
//        Warehause.addFigure(HemiSphere(3.0))
//        Warehause.addFigure(HollowCylinder(3.0, 4.5, 2.0))
//        Warehause.addFigure(SpericalShell(3.0, 4.5))
//        Warehause.addFigure(Sphere(3.0))


        printCountOfFigures()
        printTotalAreaOfSurfaces()

    }

    fun printCountOfFigures() {
        Log.d("log for ABB", ">>>printCountOfFigures:>>> ${Warehause.totalCountOfFigures()} ")
    }

    fun printTotalAreaOfSurfaces() {
        Log.d(
            "log for ABB",
            ">>>printTotalAreaOfSurfaces:>>> ${Warehause.getTotalAreaOfSurfaces()} "
        )
    }

    fun cratedListData() {
        var figureList = Warehause.figuresList()
        // use list data here
    }

}