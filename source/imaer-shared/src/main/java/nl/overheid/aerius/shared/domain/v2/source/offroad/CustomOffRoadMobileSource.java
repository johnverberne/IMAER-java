/*
 * Copyright the State of the Netherlands
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package nl.overheid.aerius.shared.domain.v2.source.offroad;

import nl.overheid.aerius.shared.domain.v2.characteristics.SourceCharacteristics;

public class CustomOffRoadMobileSource extends OffRoadMobileSource {

  private static final long serialVersionUID = 2L;

  private SourceCharacteristics characteristics;
  private OffRoadVehicleSpecification vehicleSpecification;

  public SourceCharacteristics getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(final SourceCharacteristics characteristics) {
    this.characteristics = characteristics;
  }

  public OffRoadVehicleSpecification getVehicleSpecification() {
    return vehicleSpecification;
  }

  public void setVehicleSpecification(final OffRoadVehicleSpecification vehicleSpecification) {
    this.vehicleSpecification = vehicleSpecification;
  }

}
