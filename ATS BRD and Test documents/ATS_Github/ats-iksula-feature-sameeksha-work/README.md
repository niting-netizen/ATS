# Iksula ATS - Applicant Tracking System

An internal Applicant Tracking System for Iksula that replaces spreadsheet-based recruitment tracking with a structured, role-based web application.

## 🏗️ Tech Stack

- **Frontend:** Next.js 14 (App Router) + Tailwind CSS + Custom React UI Components
- **Backend:** Node.js + Express + TypeScript
- **Database:** PostgreSQL 15
- **Authentication:** Google OAuth 2.0 + Email/Password with JWT (httpOnly cookies)
- **Deployment:** Docker Compose (PostgreSQL + Backend + Frontend)

## 📁 Project Structure

```
├── backend/                 # Express API Server (Port 5001)
│   ├── src/
│   │   ├── config/         # Database, environment, Passport config
│   │   ├── middleware/     # Auth (JWT), RBAC, Error handling
│   │   ├── routes/         # API endpoints (auth, users, requisitions, candidates, etc.)
│   │   ├── services/       # Business logic (SLA, KPI, Import, Notifications)
│   │   └── index.ts        # Express entry point
│   ├── migrations/         # SQL migrations (001-036+)
│   └── package.json
│
├── frontend/                # Next.js UI (Port 3000)
│   ├── app/
│   │   ├── (auth)/login/   # Login page
│   │   └── (dashboard)/    # Protected pages with sidebar
│   ├── components/ui/      # Reusable UI components (plain React)
│   ├── lib/               # API client, Auth context, utilities
│   ├── public/            # Static assets
│   └── package.json
│
├── shared/                  # Shared TypeScript types
│   └── types.ts
│
├── deploy/                  # Deployment scripts & configs
│   ├── setup-server.sh
│   ├── update.sh
│   └── nginx.conf
│
├── docker-compose.yml       # Production compose config
├── docker-compose.local.yml # Local development config
├── BRD.md                   # Business Requirements Document
└── TECHNICAL_ARCHITECTURE.md # Technical details
```

## 🚀 Quick Start

### Prerequisites
- Node.js 18+
- PostgreSQL 15
- Docker & Docker Compose (optional)

### Local Development Setup

```bash
# Clone the repository
git clone https://github.com/niting-netizen/ATS.git
cd ATS

# 1. Create database
createdb iksula_ats

# 2. Backend Setup
cd backend
npm install
cp .env.example .env
# Edit .env to set DATABASE_URL
npm run setup              # Runs migrations + seeds test users
npm run dev                # Start API on port 5001

# 3. Frontend Setup (new terminal)
cd frontend
npm install
cp .env.local.example .env.local
npm run dev                # Start UI on port 3000
```

### Running with Docker Compose

```bash
docker-compose up -d       # Starts PostgreSQL, Backend, and Frontend
docker-compose down        # Stop services
```

## 🔐 Test Credentials

Default test user (recruitment_lead role):
- **Email:** `admin@iksula.com`
- **Password:** `admin123`

Available roles: `recruiter`, `recruitment_lead`, `hiring_manager`, `hr_ceo`

## 📋 Available Commands

### Backend
```bash
npm run dev              # Start development server with hot reload
npm run build            # Compile TypeScript to JavaScript
npm run migrate          # Run SQL migrations
npm run seed             # Seed test users
npm run setup            # Run migrations + seed in one command
npm test                 # Run API tests (~48 tests)
npm run start            # Start production server
```

### Frontend
```bash
npm run dev              # Start Next.js dev server
npm run build            # Build for production
npm start                # Start production server
npm run test:e2e         # Run Playwright E2E tests
npm run lint             # Run ESLint
```

## 🗄️ Database

- **Database Type:** PostgreSQL 15
- **Migrations:** Located in `backend/migrations/` (numbered SQL files)
- **Computed Columns:** `total_ctc` and `total_resource_cost` in `offers` table are PostgreSQL GENERATED ALWAYS columns
- **Default Connection:** `postgresql://dj@localhost:5432/iksula_ats`

### Migration Files
- Migrations are tracked in the `migrations` table
- Run `npm run migrate` to execute pending migrations
- Current: 36+ migrations covering users, requisitions, candidates, offers, notifications, etc.

## 🔑 Key Features

- **Role-Based Access Control (RBAC):** Enforce permissions on every API route
- **Multi-Stage Pipeline:** Requisition → Candidates → Stage Progress → Offers
- **Interview Management:** Manage HM feedback and interview rounds
- **SLA & KPI Tracking:** Track performance metrics
- **Bulk Import:** Import candidates and requisitions
- **Activity Logs:** Audit trail for all actions
- **Notifications:** Real-time notifications for key events
- **CV Matching:** AI-powered CV scoring and pool matching

## 🧪 Testing

### Backend Tests
```bash
cd backend
npm test                 # Run Jest tests
```

### Frontend E2E Tests
```bash
cd frontend
npx playwright install chromium
npm run test:e2e         # Run Playwright tests
```

## 📚 Documentation

- [BRD.md](./BRD.md) - Business Requirements Document
- [TECHNICAL_ARCHITECTURE.md](./TECHNICAL_ARCHITECTURE.md) - System design & architecture
- [CLAUDE.md](./CLAUDE.md) - Developer guidelines

## 🔗 API Routes

Base URL: `http://localhost:5001/api`

**Authentication:**
- `POST /auth/login` - Email/password login
- `POST /auth/google` - Google OAuth login
- `POST /auth/logout` - Logout

**Requisitions:**
- `GET /requisitions` - List all requisitions
- `POST /requisitions` - Create new requisition
- `GET /requisitions/:id` - Get requisition details

**Candidates:**
- `GET /candidates` - List candidates
- `POST /candidates` - Add candidate
- `GET /candidates/:id` - Get candidate details

**Offers:**
- `GET /offers` - List offers
- `POST /offers` - Create offer

**Dashboard:**
- `GET /dashboard` - Dashboard metrics

*Refer to `TECHNICAL_ARCHITECTURE.md` for complete API documentation.*

## 🛠️ Development Notes

### Authentication Context
- JWT payload stored in `req.currentUser` (NOT `req.user`) in Express routes
- JWT contains: `{ userId, email, role, name }`
- Axios interceptor in `lib/api.ts` handles auth redirects

### UI Components
- All components in `frontend/components/ui/` are plain React + Tailwind
- **Do NOT use** `@base-ui/react` or `@radix-ui` primitives (causes runtime crashes)
- Use only inline styles or Tailwind classes

### Port Configuration
- Backend: `5001` (port 5000 conflicts with macOS AirPlay)
- Frontend: `3000`
- PostgreSQL: `5432`

## 📦 Dependencies

### Backend
- Express.js - Web framework
- TypeScript - Type safety
- PostgreSQL - Database driver (pg)
- Passport.js - Authentication
- Jest - Testing framework

### Frontend
- Next.js 14 - React framework
- TypeScript - Type safety
- Tailwind CSS - Styling
- Axios - HTTP client
- Playwright - E2E testing

## 🚢 Deployment

See [deploy/](./deploy/) folder for deployment scripts:
- `setup-server.sh` - Initial server setup
- `update.sh` - Update deployed application
- `nginx.conf` - Production Nginx configuration

## 👥 Contributing

1. Create a feature branch from `main`
2. Make your changes
3. Run tests: `npm test` (backend) and `npm run test:e2e` (frontend)
4. Commit with clear messages
5. Create a Pull Request

## 📝 License

Internal use only - Iksula Services

## 👨‍💼 Support

For issues and questions, contact the development team or open an issue on GitHub.

---

**Last Updated:** June 2026
**Current Version:** 1.0.0
