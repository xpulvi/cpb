import 'package:faker/faker.dart';

class FakerService {
  // Istanza privata statica
  static final FakerService _instance = FakerService._internal();
  // Istanza di Faker
  final Faker faker;
  // Costruttore privato
  FakerService._internal() : faker = Faker();
  // Punto di accesso pubblico all'istanza
  static FakerService get instance => _instance;
}
