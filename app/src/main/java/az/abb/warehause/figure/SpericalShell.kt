package az.abb.warehause.figure

import az.abb.warehause.CalculateUtil.calculateOuterSphericalShellCSA
import az.abb.warehause.CalculateUtil.calculateSphericalShellPA
import az.abb.warehause.CalculateUtil.calculateSphericalShellTA
import az.abb.warehause.CalculateUtil.calculateSphericalShellVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class SpericalShell(
    val innerRadius: Double,
    val outerRadius: Double
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateOuterSphericalShellCSA(outerRadius = outerRadius)
    }

    override fun calculatePlaneArea(): Double {
        return calculateSphericalShellPA()
    }

    override fun calculateTotalArea(): Double {
        return calculateSphericalShellTA(outerRadius = outerRadius, innerRadius = innerRadius)
    }

    override fun calculateVolumeArea(): Double {
        return calculateSphericalShellVolume(outerRadius = outerRadius, innerRadius = innerRadius)
    }
}
