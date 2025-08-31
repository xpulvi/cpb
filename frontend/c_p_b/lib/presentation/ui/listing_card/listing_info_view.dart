import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/colors.dart';

class ListingInfoView extends StatelessWidget {
  const ListingInfoView({
    super.key,
    required this.name,
    required this.location,
    required this.price,
  });

  final String name;
  final String location;
  final int price;

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      children: [
        Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              name,
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.bold,
                color: Colors.black,
              ),
            ),
            Text(
              location,
              style: TextStyle(fontSize: 16, color: Colors.black54),
            ),
          ],
        ),
        Column(
          crossAxisAlignment: CrossAxisAlignment.end,
          children: [
            Text(
              "Property Price",
              style: TextStyle(
                fontSize: 14,
                fontWeight: FontWeight.w500,
                color: Colors.black54,
              ),
            ),
            Text(
              "\$${price.toString()}",
              style: TextStyle(
                fontSize: 18,
                color: kBrandColorPrimary,
                fontWeight: FontWeight.bold,
              ),
            ),
          ],
        ),
      ],
    );
  }
}
