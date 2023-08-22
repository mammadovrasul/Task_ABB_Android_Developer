package az.abb.warehause.figure

import az.abb.warehause.CalculateUtil.calculateCuboidBottomFace
import az.abb.warehause.CalculateUtil.calculateCuboidCSA
import az.abb.warehause.CalculateUtil.calculateCuboidTA
import az.abb.warehause.CalculateUtil.calculateCuboidTopFace
import az.abb.warehause.CalculateUtil.calculateCuboidVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class Cuboid(
    private val length: Double,
    private val breadth: Double,
    private val height: Double
) : Figure() {

    override fun calculateCurvedSurfaceArea(): Double {
        return calculateCuboidCSA(l = length, b = breadth, h = height)
    }

    override fun calculatePlaneArea(): Double {
        return calculateCuboidTopFace(
            l = length,
            b = breadth
        ) + calculateCuboidBottomFace(l = length, b = breadth)
    }

    override fun calculateTotalArea(): Double {
        return calculateCuboidTA(l = length, b = breadth, h = height)
    }

    override fun calculateVolumeArea(): Double {
        return calculateCuboidVolume(l = length, b = breadth, h = height)
    }
}
