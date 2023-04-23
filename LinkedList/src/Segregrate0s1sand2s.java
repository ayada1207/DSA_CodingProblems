
public class Segregrate0s1sand2s {

	static Node numbersInNode(Node head, int n) {
		Node zns = null;
		Node zne = null;
		Node ons = null;
		Node one = null;
		Node tns = null;
		Node tne = null;

		for (Node curr = head; curr != null; curr = curr.next) {
			int x = curr.data;
			if (x == 0) {
				if (zns == null) {
					zns = zne = curr;
				} else {
					zne.next = curr;
					zne = curr;
				}
			}

			if (x == 1) {
				if (ons == null) {
					ons = one = curr;
				} else {
					one.next = curr;
					one = curr;
				}
			}
			if (x == 2) {
				if (tns == null) {
					tns = tne = curr;
				} else {
					tne.next = curr;
					tne = curr;
				}
			}
		}

		if (zns == null && ons == null && tns == null) {
			return null;
		}
		if (zns == null && ons == null) {
			tne.next = null;
			return tns;
		}
		if (zns == null && tns == null) {
			one.next = null;
			return ons;
		}
		if (ons == null && tns == null) {
			zne.next = null;
			return zns;
		}
		if (zns == null) {
			one.next = tns;
			tne.next = null;
			return ons;
		}
		if (ons == null) {
			zne.next = tns;
			tne.next = null;
			return zns;
		}
		if (tns == null) {
			zne.next = ons;
			one.next = null;
			return zns;
		}
		zne.next = ons;
		one.next = tns;
		tne.next = null;
		return zns;
	}
}
