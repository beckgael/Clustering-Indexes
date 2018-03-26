package lipn.bgthesis.scala.clustering

trait DataSetsTypes
{
	type ID
	type NaturesValue
	type ClusterID = Int
	type Vector = Array[NaturesValue]
	type Mod = Array[NaturesValue]
	type ClusterizedData = Array[(ClusterID, (ID, Vector))]

}

trait RealDatasets extends DataSetsTypes
{
	type NaturesValue = Double
}

trait ScalaDatasetsTypes extends DataSetsTypes
{
	type ID = Int
}

trait RealScalaDatasets extends RealDatasets with ScalaDatasetsTypes