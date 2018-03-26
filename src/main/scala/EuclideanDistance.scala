package lipn.bgthesis.scala.util.distances

import _root_.scala.math.{pow, sqrt}

/**
 * Euclidean distance class with posibility to rootsquared or not results 
 **/
class Euclidean(root: Boolean)
{
	private def euclideanIntern(dot1: Seq[Double], dot2: Seq[Double]) =
	{
		var d = 0D
		for( i <- dot1.indices ) d += pow(dot1(i) - dot2(i), 2)
		d
	}

	/**
	  * The famous euclidean distance implemented in its fast mono thread scala version without SQRT part
	  * @return The Euclidean distance between dot1 and dot2
	  **/
	def distance(dot1: Seq[Double], dot2: Seq[Double]) : Double =
	{
		if( root ) sqrt(euclideanIntern(dot1, dot2))
		else euclideanIntern(dot1, dot2)
	}

	lazy val toStringRoot = if( root ) "with " else "without "

	override def toString = "Euclidean " + toStringRoot + "root applied"

}



