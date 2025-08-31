import 'package:flutter/material.dart';
import 'package:c_p_b/presentation/styles/dimens.dart';
import 'package:c_p_b/utils/utils.dart';

class NavigationButton extends StatelessWidget {
  const NavigationButton({
    super.key,
    required this.onPressed,
    required this.label,
  });

  final VoidCallback onPressed;
  final String label;

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      width: getScreenWidth(context) * .8,
      height: kMainButtonHeight,
      child: FilledButton.tonal(onPressed: onPressed, child: Text(label)),
    );
  }
}
