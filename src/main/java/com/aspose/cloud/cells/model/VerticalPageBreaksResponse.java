/* 
 * <summary>
 *  Copyright (c) 2020 Aspose.Cells Cloud
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all 
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaks;

/**
 * VerticalPageBreaksResponse
 */

public class VerticalPageBreaksResponse extends CellsCloudResponse {
  private String status = null;

  private Integer code = null;

  private VerticalPageBreaks verticalPageBreaks = null;

  public VerticalPageBreaksResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VerticalPageBreaksResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public VerticalPageBreaksResponse verticalPageBreaks(VerticalPageBreaks verticalPageBreaks) {
    this.verticalPageBreaks = verticalPageBreaks;
    return this;
  }

   /**
   * Get verticalPageBreaks
   * @return verticalPageBreaks
  **/
  @ApiModelProperty(value = "")
  public VerticalPageBreaks getVerticalPageBreaks() {
    return verticalPageBreaks;
  }

  public void setVerticalPageBreaks(VerticalPageBreaks verticalPageBreaks) {
    this.verticalPageBreaks = verticalPageBreaks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerticalPageBreaksResponse verticalPageBreaksResponse = (VerticalPageBreaksResponse) o;
    return Objects.equals(this.status, verticalPageBreaksResponse.status) &&
        Objects.equals(this.code, verticalPageBreaksResponse.code) &&
        Objects.equals(this.verticalPageBreaks, verticalPageBreaksResponse.verticalPageBreaks) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, verticalPageBreaks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticalPageBreaksResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    verticalPageBreaks: ").append(toIndentedString(verticalPageBreaks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

