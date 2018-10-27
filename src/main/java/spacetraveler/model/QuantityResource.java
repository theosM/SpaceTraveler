package spacetraveler.model;

import spacetraveler.model.resources.Resources;

import java.util.Objects;

public class QuantityResource {

	public Resources resource;
	public int quantity;

	public QuantityResource(Resources resource, int quantity) {
		this.resource = resource;
		this.quantity = quantity;
	}

	public void addQuantity(int quantity){
		this.quantity += quantity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QuantityResource that = (QuantityResource) o;
		return quantity == that.quantity &&
				Objects.equals(resource, that.resource);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resource);
	}
}