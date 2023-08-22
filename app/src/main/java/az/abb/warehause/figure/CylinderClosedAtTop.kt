package az.abb.warehause.figure

import az.abb.warehause.CalculateUtil.calculateCylinderCloseAtTopCSA
import az.abb.warehause.CalculateUtil.calculateCylinderCloseAtTopFacePA
import az.abb.warehause.CalculateUtil.calculateCylinderCloseAtTopTA
import az.abb.warehause.CalculateUtil.calculateCylinderCloseAtTopVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class CylinderClosedAtTop(
    val height: Double,
    val radius: Double
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateCylinderCloseAtTopCSA(radius = radius, h = height)
    }

    override fun calculatePlaneArea(): Double {
        return calculateCylinderCloseAtTopFacePA(radius = radius)
    }

    override fun calculateTotalArea(): Double {
        return calculateCylinderCloseAtTopTA(radius = radius, h = height)
    }

    override fun calculateVolumeArea(): Double {
        return calculateCylinderCloseAtTopVolume(radius = radius, h = height)
    }
}
