package az.abb.warehause.figure

import az.abb.warehause.CalculateUtil.calculateHollowCylinderInternalCSA
import az.abb.warehause.CalculateUtil.calculateHollowCylinderInternalTA
import az.abb.warehause.CalculateUtil.calculateHollowCylinderTopFaceAreaPA
import az.abb.warehause.CalculateUtil.calculateHollowCylinderVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class HollowCylinder(
    val height: Double,
    val outerRadius: Double,
    val innerRadius: Double
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateHollowCylinderInternalCSA(innerRadius = innerRadius, h = height)
    }

    override fun calculatePlaneArea(): Double {
        return calculateHollowCylinderTopFaceAreaPA(
            innerRadius = innerRadius,
            outerRadius = outerRadius
        )
    }

    override fun calculateTotalArea(): Double {
        return calculateHollowCylinderInternalTA(
            innerRadius = innerRadius,
            outerRadius = outerRadius,
            h = height
        )
    }

    override fun calculateVolumeArea(): Double {
        return calculateHollowCylinderVolume(
            innerRadius = innerRadius,
            outerRadius = outerRadius,
            h = height
        )
    }
}
