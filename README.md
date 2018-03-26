# Clustering Indexes [ ![Download](https://api.bintray.com/packages/clustering4ever/maven/clustering-indexes/images/download.svg) ](https://bintray.com/clustering4ever/maven/clustering-indexes/_latestVersion) 

Here are a bit of work i've made during my Ph.D thesis, it concern clustering evaluation. It will gather some internal clustering index as [Davies Bouldin](https://en.wikipedia.org/wiki/Davies%E2%80%93Bouldin_index) and [Silhouette](https://en.wikipedia.org/wiki/Silhouette_(clustering)) and external one as the (normalized) [mutual information](https://en.wikipedia.org/wiki/Mutual_information). There will be implemented neither in pure scala neither in scala/spark.

## For the moment

### Internal indexes
* Scala
  * Davies Bouldin
  * Silhouette

## Coming

### Internal indexes
* Spark
  * Davies Bouldin
  * NMI (already integrate in [Smile](http://haifengl.github.io/smile/api/scala/smile/validation/MutualInformationScore.html))