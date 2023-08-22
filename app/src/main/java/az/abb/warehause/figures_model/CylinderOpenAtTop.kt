package az.abb.warehause.figures_model

import az.abb.warehause.CalculateUtil.calculateCylinderOpenAtTopCSA
import az.abb.warehause.CalculateUtil.calculateCylinderOpenAtTopFacePA
import az.abb.warehause.CalculateUtil.calculateCylinderOpenAtTopTA
import az.abb.warehause.CalculateUtil.calculateCylinderOpenAtTopVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class CylinderOpenAtTop(
    val height: Double,
    val radius: Double
): Figure(){
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateCylinderOpenAtTopCSA(radius = radius, h = height)
    }

    override fun calculatePlaneArea(): Double {
        return calculateCylinderOpenAtTopFacePA()
    }

    override fun calculateTotalArea(): Double {
        return calculateCylinderOpenAtTopTA(radius = radius, h = height)
    }

    override fun calculateVolumeArea(): Double {
        return calculateCylinderOpenAtTopVolume(radius = radius, h = height)
    }
}
