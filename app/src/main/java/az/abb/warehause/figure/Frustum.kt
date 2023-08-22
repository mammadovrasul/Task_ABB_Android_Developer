package az.abb.warehause.figure

import az.abb.warehause.CalculateUtil.calculateFrustumCSA
import az.abb.warehause.CalculateUtil.calculateFrustumTA
import az.abb.warehause.CalculateUtil.calculateFrustumTopFaceAreaPA
import az.abb.warehause.CalculateUtil.calculateFrustumVolume
import az.abb.warehause.Figure

/**
 * Created by rasulmammadov on 22,August,2023
 */
data class Frustum(
    val height: Double,
    val radiusOfTop: Double,
    val radiusOfBottom: Double,
    val slantHeight: Double
) : Figure() {
    override fun calculateCurvedSurfaceArea(): Double {
        return calculateFrustumCSA(
            outerRadius = radiusOfBottom,
            innerRadius = radiusOfTop,
            l = slantHeight
        )
    }

    override fun calculatePlaneArea(): Double {
        return calculateFrustumTopFaceAreaPA(innerRadius = radiusOfTop)
    }

    override fun calculateTotalArea(): Double {
        return calculateFrustumTA(
            outerRadius = radiusOfBottom,
            innerRadius = radiusOfTop,
            l = slantHeight
        )
    }

    override fun calculateVolumeArea(): Double {
        return calculateFrustumVolume(
            outerRadius = radiusOfBottom,
            innerRadius = radiusOfTop,
            h = height
        )
    }
}
