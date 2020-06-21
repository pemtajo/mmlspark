package org.apache.spark.sql.expressions

import org.apache.spark.sql.types.DataType

object UDFExtractor {
  def getF(udf: UserDefinedFunction): AnyRef = udf.asInstanceOf[SparkUserDefinedFunction].f
  def getDataType(udf: UserDefinedFunction): DataType = udf.asInstanceOf[SparkUserDefinedFunction].dataType
}
