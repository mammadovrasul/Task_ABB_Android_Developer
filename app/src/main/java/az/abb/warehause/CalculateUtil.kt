package az.abb.warehause

import kotlin.math.pow

/**
 * Created by rasulmammadov on 22,August,2023
 *
 * CSA - Curved Surface Area
 * PA - Plane Area
 * TA - Total Area
 * Volume - Volume
 */
object CalculateUtil {
    private const val PI = 3.14


    /**
    CUBOID

    h = height

    b = breadth

    l = length
     */

    fun calculateCuboidCSA(l: Double, b: Double, h: Double): Double {
        return 2 * (l * h + b * h)
    }

    fun calculateCuboidTopFace(l: Double, b: Double): Double {
        return l * b
    }

    fun calculateCuboidBottomFace(l: Double, b: Double): Double {
        return l * b
    }

    fun calculateCuboidTA(l: Double, b: Double, h: Double): Double {
        return 2 * (l * b + b * h + h * l)
    }

    fun calculateCuboidVolume(l: Double, b: Double, h: Double): Double {
        return l * b * h
    }

    /**
    CUBE*/

    fun calculateCubeLiteralSurfaceArea(length: Double): Double {
        return 4 * length.pow(2)
    }

    fun calculateCubeTopFace(length: Double): Double {
        return length.pow(2)
    }

    fun calculateCubeBottomFace(length: Double): Double {
        return length.pow(2)
    }

    fun calculateCubeTA(length: Double): Double {
        return 6 * length.pow(2)
    }

    fun calculateCubeVolume(length: Double): Double {
        return length.pow(3)
    }


    /**
    CYLINDER CLOSED AT TOP

    h = height of CYLINDER
    r: radius

     */

    fun calculateCylinderCloseAtTopCSA(radius: Double, h: Double): Double {
        return 2 * PI * radius * h
    }

    fun calculateCylinderCloseAtTopTA(radius: Double, h: Double): Double {
        return PI * radius * (2 * h + radius)
    }

    fun calculateCylinderCloseAtTopFacePA(radius: Double): Double {
        return PI * radius.pow(2)
    }

    fun calculateCylinderCloseAtBottomFacePA(radius: Double): Double {
        return PI * radius.pow(2)
    }

    fun calculateCylinderCloseAtTopVolume(radius: Double, h: Double): Double {
        return PI * radius.pow(2) * h
    }

    /**
    CYLINDER OPEN AT TOP

    h = height of CYLINDER
    r: radius

     */

    fun calculateCylinderOpenAtTopCSA(radius: Double, h: Double): Double {
        return 2 * PI * radius * h
    }

    fun calculateCylinderOpenAtTopTA(radius: Double, h: Double): Double {
        return PI * radius * (2 * h + radius)
    }

    fun calculateCylinderOpenAtTopFacePA(): Double {
        return 0.0
    }

    fun calculateCylinderOpenAtBottomFacePA(radius: Double): Double {
        return PI * radius.pow(2)
    }

    fun calculateCylinderOpenAtTopVolume(radius: Double, h: Double): Double {
        return PI * radius.pow(2) * h
    }


    /**
    HOLLOW CYLINDER

    h = height of CYLINDER
    R:Radius of outer shell - outerRadius
    r:Radius of inner shell - innerRadius

     */

    fun calculateHollowCylinderInternalCSA(innerRadius: Double, h: Double): Double {
        return 2 * PI * innerRadius * h
    }

    fun calculateHollowCylinderExternalCSA(outerRadius: Double, h: Double): Double {
        return 2 * PI * outerRadius * h
    }

    fun calculateHollowCylinderTopFaceAreaPA(innerRadius: Double, outerRadius: Double): Double {
        return PI * (outerRadius.pow(2) - innerRadius.pow(2))
    }

    fun calculateHollowCylinderBottomFaceAreaPA(innerRadius: Double, outerRadius: Double): Double {
        return PI * (outerRadius.pow(2) - innerRadius.pow(2))
    }

    fun calculateHollowCylinderInternalTA(
        innerRadius: Double,
        outerRadius: Double,
        h: Double
    ): Double {
        return calculateHollowCylinderExternalCSA(
            outerRadius,
            h
        ) + calculateHollowCylinderInternalCSA(
            innerRadius,
            h
        ) + 2 * PI * (outerRadius.pow(2) - innerRadius.pow(2))
    }

    fun calculateHollowCylinderVolume(
        innerRadius: Double,
        outerRadius: Double,
        h: Double
    ): Double {
        return PI * h * (outerRadius.pow(2) - innerRadius.pow(2))
    }

    /**
    CONE

    h = height

    r = radius of top face

    l = slant height

     */

    fun calculateConeCSA(r: Double, l: Double): Double {
        return PI * r * l
    }

    fun calculateConeBottomFaceAreaPA(r: Double): Double {
        return PI * r.pow(2)
    }

    fun calculateConeTA(r: Double, l: Double): Double {
        return PI * r.pow(2) + PI * r * l
    }

    fun calculateConeVolume(r: Double, h: Double): Double {
        return (1.0 / 3.0) * PI * r.pow(2) * h
    }

    /**
    FRUSTUM

    h = height of frustum

    r = radius of top face innerRadius

    R = Radius of base outerRadius

    l = slant height

     */

    fun calculateFrustumCSA(outerRadius: Double, innerRadius: Double, l: Double): Double {
        return PI * l * (outerRadius + innerRadius)
    }

    fun calculateFrustumTopFaceAreaPA(innerRadius: Double): Double {
        return PI * innerRadius.pow(2)
    }

    fun calculateFrustumBottomFaceAreaPA(outerRadius: Double): Double {
        return PI * outerRadius.pow(2)
    }

    fun calculateFrustumTA(outerRadius: Double, innerRadius: Double, l: Double): Double {
        return calculateFrustumTopFaceAreaPA(innerRadius) + calculateFrustumBottomFaceAreaPA(
            outerRadius
        ) + PI * l * (innerRadius + outerRadius)
    }

    fun calculateFrustumVolume(outerRadius: Double, innerRadius: Double, h: Double): Double {
        return (1.0 / 3.0) * PI * h * (outerRadius.pow(2) + innerRadius.pow(2) + outerRadius * innerRadius)

    }

    /**
    SPHERE*/

    fun calculateSphereCSA(radius: Double): Double {
        return 4 * PI * radius * radius
    }

    fun calculateSphereVolume(radius: Double): Double {
        return (4.0 / 3.0) * PI * radius.pow(3)
    }

    fun calculateSphereTA(radius: Double): Double {
        return 4 * PI * radius * radius
    }

    fun calculateSpherePA(radius: Double): Double {
        return 0.0
    }

    /**
    HEMISPHERE*/

    fun calculateHemisphereCSA(radius: Double): Double {
        return 2 * PI * radius.pow(2)
    }

    fun calculateHemispherePA(radius: Double): Double {
        return PI * radius.pow(2)
    }

    fun calculateHemisphereTA(radius: Double): Double {
        return 3 * PI * radius.pow(2)
    }

    fun calculateHemisphereVolume(radius: Double): Double {
        return (2.0 / 3.0) * PI * radius.pow(3)
    }

    /**
    SPHERICAL SHELL

    R:Radius of outer shell - outerRadius
    r:Radius of inner shell - innerRadius
     */

    fun calculateOuterSphericalShellCSA(outerRadius: Double): Double {
        return 2 * PI * outerRadius.pow(2)
    }

    fun calculateInnerSphericalShellCSA(innerRadius: Double): Double {
        return 2 * PI * innerRadius.pow(2)
    }

    fun calculateSphericalShellPA(): Double {
        return 0.0
    }

    fun calculateSphericalShellTA(outerRadius: Double, innerRadius: Double): Double {
        return calculateOuterSphericalShellCSA(outerRadius) + calculateInnerSphericalShellCSA(
            innerRadius
        )
    }

    fun calculateSphericalShellVolume(outerRadius: Double, innerRadius: Double): Double {
        return (4.0 / 3.0) * PI * (outerRadius!!.pow(3) - innerRadius!!.pow(3))
    }

}