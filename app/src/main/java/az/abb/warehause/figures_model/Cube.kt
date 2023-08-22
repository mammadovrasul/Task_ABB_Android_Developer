package az.abb.warehause.figures_model

import az.abb.warehause.CalculateUtil.calculateCubeBottomFace
import az.abb.warehause.CalculateUtil.calculateCubeLiteralSurfaceArea
import az.abb.warehause.CalculateUtil.calculateCubeTA
import az.abb.warehause.CalculateUtil.calculateCubeTopFace
import az.abb.warehause.CalculateUtil.calculateCubeVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class Cube(val side: Double) : Figure(){
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateCubeLiteralSurfaceArea(side)
    }

    override fun calculatePlaneArea(): Double {
        return calculateCubeTopFace(side) + calculateCubeBottomFace(side)
    }

    override fun calculateTotalArea(): Double {
        return calculateCubeTA(side)
    }

    override fun calculateVolumeArea(): Double {
        return calculateCubeVolume(side)
    }
}
